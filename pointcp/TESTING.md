
# Your discussion about testing

The tests below are done by running a for loop 35 000 000 times due to the case of CP4 being efficient in returning values.
Each test would have a random x value from 0-100 and half of the tests would be Cartesian while the others would be Polar.
The extra methods, GetDistance, RotatePoint, and ToString were also ran to also simulate their iterations despite the similarity.
Time was measured in nanoseconds and converted to milliseconds to represent the time as requested. 

Below is a table of our times and outputs from said tests:


CP2 Data:

Time in miliseconds: 12345
Time in seconds: 12.345
Time in miliseconds: 12530
Time in seconds: 12.530
Time in miliseconds: 20346
Time in seconds: 20.346
Time in miliseconds: 20253
Time in seconds: 20.253
Time in miliseconds: 22507
Time in seconds: 22.507

Minimum: 12.345
Maximum: 22.507
Median:  20.346

CP3 Data:

Time in miliseconds: 29909
Time in seconds: 29.909
Time in miliseconds: 30298
Time in seconds: 30.298
Time in miliseconds: 30368
Time in seconds: 30.368
Time in miliseconds: 30600
Time in seconds: 30.600
Time in miliseconds: 30976
Time in seconds: 30.976

Minimum: 29.909
Maximum: 30.976
Median:  30.368

CP4 Data:

Time in miliseconds: 7919
Time in seconds: 7.919
Time in miliseconds: 8413
Time in seconds: 8.413
Time in miliseconds: 8907
Time in seconds: 8.907
Time in miliseconds: 9343
Time in seconds: 9.343
Time in miliseconds: 9442
Time in seconds:9.442

Minimum: 7.919
Maximum: 9.442
Median:  8.907


Design 5:


CP2:
Time in miliseconds: 5013
Time in seconds: 5.013
Time in miliseconds: 7342
Time in seconds: 7.342
Time in miliseconds: 14625
Time in seconds: 14.625
Time in miliseconds: 17995
Time in seconds: 17.995
Time in miliseconds: 19222
Time in seconds: 19.222

Minimum: 5.013
Maximum: 19.222
Median:  14.625


CP3:

Time in miliseconds: 28564
Time in seconds: 28.564
Time in miliseconds: 30243
Time in seconds:30.243
Time in miliseconds: 30907
Time in seconds: 30.907
Time in miliseconds: 33462
Time in seconds: 33.462
Time in miliseconds: 33871
Time in seconds: 33.871

Minimum: 28.564
Maximum: 33.871
Median:  30.907


The fastest design for returning coordinates is by far CP4 with a median of 8.907 seconds. However, it is known it allocates more memory than any other design as well.
The CP2 within design 5 ran 4.5 seconds faster than it's original counterpart, however CP3 ran just the same. 
It appears that the designs that run the fastest use more memory while the slower ones use less, each having their own advantage and disadvantage through that. 

