from flask import Flask
import urllib3
import json
from process import *
from  eureka_conversion import *
app = Flask(__name__)

eureka_run()

@app.route('/')
def hello_world():
    return 'Hello, World!'

@app.route('/process')
def process_call():
   # print(request.args)
   # c = int(request.args.get("a"))
   return str(ds_start(10,5))

@app.route('/currency-exchange/from/<euro_con>/to/<bdt_con>')  
def currency_converter(euro_con,bdt_con):
    if euro_con == "EUR":
        res_ = {
            "from": "EUR",
            "to" : "BDT", 
            "unit": "90"
        }
        return res_
    elif euro_con == "BDT":
        res_ = {
            "from": "BDT",
            "to" : "EUR", 
            "unit": ".90"
        }
                
        return res_
    else :
        res_ = {
            "from": "DOL",
            "to" : "BDT", 
            "unit": "70"
        }
        return res_

@app.route('/get-data/<number>')
def hello(number):
   http = urllib3.PoolManager()
   url = "/number-to-word/<" + number+ ">"
   response = http.request('GET', url)
   response = json.loads(response.data.decode('utf-8'))
   return response["message"]

if __name__ == '__main__':
    app.run(host='0.0.0.0')