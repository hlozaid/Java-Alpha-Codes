import pywhatkit as kit
from datetime import datetime, timedelta
import time

def send_whatsapp_message(phone_number, message):
    # Calculate the scheduled time (1 hour before the birthday time)
    birthday_time = datetime(2024, 6, 16, 12, 0)  # Replace with the actual birthday date and time
    scheduled_time = birthday_time - timedelta(hours=1)

    # Convert scheduled time to hour and minute
    hour = scheduled_time.hour
    minute = scheduled_time.minute

    # Send the message at the scheduled time
    kit.sendwhatmsg(phone_number, message, hour, minute)

    printf("Scheduled WhatsApp message to be sent at {scheduled_time.strftime('%Y-%m-%d %")
