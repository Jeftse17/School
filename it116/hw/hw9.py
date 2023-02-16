def average_rain(file):
    total_rain = 0
    count = 0
    for line in file:
        rain = float(line.split()[1])
        total_rain += rain
        count += 1
    average_rain = total_rain / count
    return round(average_rain, 2)

def max_rain_date(file):
    max_rain = 0
    max_rain_date = None
    for line in file:
        date, rain = line.split()
        rain = int(rain)
        if rain > max_rain:
            max_rain = rain
            max_rain_date = date
    return (max_rain, max_rain_date)

# Test code

FILENAME = "rainfall.txt"
file = open(FILENAME, "r")
average = average_rain(file)
print(average)
file.close()
file = open(FILENAME, "r")
max_rain, max_date = max_rain_date(file)
print(max_rain, max_date)