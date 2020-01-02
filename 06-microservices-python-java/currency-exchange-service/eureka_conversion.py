import py_eureka_client.eureka_client as eureka_client

def eureka_run():
    your_rest_server_port = 5000
    # The flowing code will register your server to eureka server and also start to send heartbeat every 30 seconds
    eureka_client.init_registry_client(eureka_server="http://naming-server:8761/eureka/",
                                    app_name="currency-exchange-service",
                                    instance_port=your_rest_server_port)
