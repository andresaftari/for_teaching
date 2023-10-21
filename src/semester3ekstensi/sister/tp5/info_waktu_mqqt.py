import datetime
import time
import paho.mqtt.client as mqtt


# Message carried by MQTT
def message_request(message):
    print(topic, str(message.payload.decode()))


# Broker IP Address & Topic name
broker_address = '127.0.0.1'
topic = 'info_waktu'

# Callback function
client_mqtt = mqtt.Client('Client01')
client_mqtt.on_message = message_request
client_mqtt.connect(broker_address, port=5000)
print('Connected to MQTT Broker!')

# Run Client01 on loop
client_mqtt.loop_start()

# CLient01 -> Subscribe to Topic info_waktu (Client01 <- Broker)
client_mqtt.subscribe(topic)
print('Subscribed to topic: ', topic)

# CLient01 -> Publish to Broker Topic info_waktu (Client01 -> Broker)
while True:
    current_time = datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')
    client_mqtt.publish(topic, current_time)
    print('Published to topic: ', topic, ' | with message: ', current_time)

    # Pause every 10 seconds
    time.sleep(10)


