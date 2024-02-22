## Design
A smart home hub.

### Initial MvP
A server that listens for updates from devices and can serve the latest status to a user.

#### Message contains information
```  
device name
device id
status value
status unit
status time
```

Example: `"thermometer", "1", "23.1", "Celsius"`

#### The server can also serve GET requests with the latest status for each device.


| device name      | device id | status value | status unit | status time    |
|------------------|-----------|--------------|-------------|----------------|
| thermometer      | 1         | 23.1         | Celsius     | 1 min ago      |
| stove pwr outlet | 2         | 453.2        | Watt        | 23 seconds ago |

