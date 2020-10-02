
Commit your data about arrays here.

Use suitable tables and draw conclusions
from an analysis of the data. From your conclusions,
develop recommendations to designers.


Creation of arrays:



LinkedList miliseconds: 11865
LinkedList miliseconds: 12029
LinkedList miliseconds: 12139
LinkedList miliseconds: 12246
LinkedList miliseconds: 12273

Vector miliseconds: 1571
Vector miliseconds: 1573
Vector miliseconds: 1588
Vector miliseconds: 1618
Vector miliseconds: 1645

Array miliseconds: 1615
Array miliseconds: 1631
Array miliseconds: 1651
Array miliseconds: 1664
Array miliseconds: 1675



Itteration of arrays:



LinkedList Iteration miliseconds: 11135
LinkedList Iteration miliseconds: 11170
LinkedList Iteration miliseconds: 11249
LinkedList Iteration miliseconds: 11315
LinkedList Iteration miliseconds: 12284

Vector Iteration miliseconds: 10629
Vector Iteration miliseconds: 10657
Vector Iteration miliseconds: 10704
Vector Iteration miliseconds: 10758
Vector Iteration miliseconds: 11016

Array Iteration miliseconds: 10634
Array Iteration miliseconds: 10640
Array Iteration miliseconds: 10640
Array Iteration miliseconds: 10954
Array Iteration miliseconds: 11096



Linked List Creation Median: 12138 miliseconds (12.138 seconds)

Vector Creation Median: 1588 miliseconds (1.588 seconds)

Array Creation Median: 1651 miliseconds (1.651 seconds)


Linked List Iterration Median: 11249 miliseconds (11.249 seconds)

Vector Iterration Median: 10704 miliseconds (10704 seconds)

Array Iterration Median: 10640 miliseconds (10.640 seconds)


For the creation of arrays, the default array's and vector's are highspeed compared to the Linked List. 
However, itterating and searching through these arrays proved similar results, with Linked List being marginally slower.
The array was simpler to itterate through as it had no need to create in iterator.

For developers, I would suggest not using LinkedList for large collections of data.
If size in an array needs expanding, Vector would be better if it is for a large database.
LinkedList's are good for smaller collections which can be expanded or shortened at any notice.

Overall, I recommend Vectors as they don't build as slowly as LinkedLists nor are they constrained by set sizes like arrays are.

