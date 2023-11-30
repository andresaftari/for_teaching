from xmlrpc.server import SimpleXMLRPCServer, SimpleXMLRPCRequestHandler
import paho.mqtt.client as mqtt

# Current boarding schedule & transit location
current_boarding_schedule = '22.00'
current_transit_location = 'BDG'

# RPC server settings
HOST = "127.0.0.1"
PORT = 5005

# MQTT settings
MQTT_BROKER = "mqtt.eclipse.org"
MQTT_TOPIC_BOARDING = "tubes_lion_air_boarding"
MQTT_TOPIC_TRANSIT_LOCATION = "tubes_lion_air_boarding"


# RPC class (Server-side)
class RPCHandler:
    def get_boarding_schedule(self):
        return current_boarding_schedule

    def get_transit_location(self):
        return current_transit_location

    # Notify the changes for boarding
    def notify_boarding_changes(self, new_schedule):
        global current_boarding_schedule
        if new_schedule != current_boarding_schedule:
            current_boarding_schedule = new_schedule
            self.publish_to_mqtt(MQTT_TOPIC_BOARDING, f"New Boarding Schedule: {new_schedule}")

    # Notify the changes for location
    def notify_transit_location(self, new_location):
        global current_transit_location
        if new_location != current_transit_location:
            current_transit_location = new_location
            self.publish_to_mqtt(MQTT_TOPIC_TRANSIT_LOCATION, f"New Transit Location: {new_location}")

    # Publish message / changes to MQTT
    def publish_to_mqtt(self, topic, message):
        client = mqtt.Client()
        client.connect(MQTT_BROKER)
        client.publish(topic, message)
        client.disconnect()


server = SimpleXMLRPCServer((HOST, PORT), requestHandler=SimpleXMLRPCRequestHandler)
server.register_instance(RPCHandler())

print(f"Listening on {HOST}:{PORT}")
server.serve_forever()
