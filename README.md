# The36CubeSolver

This little solver can solve the 36 Cube puzzle by ThinkFun.   
It could use some more optimizations, but it still prints out possible solutions in just a few seconds.


[Solution]: https://pbs.twimg.com/media/CcpPtRzWAAIqCOL.jpg:large "Solution"


## The solution
*Spoiler Alert*
The following will reveal the solution and the cubes secret, so to speak.
So, if you still want to have the fun of trying to solve it, stop reading now ;)

*The Solution*
The actual 36 Cube is variant of the thirty-six officers problem, proposed by Leonhard Euler in 1782.
Euler already conjectured there was no solution to this problem, which itself is a variant of a Graeco-Latin square.
Gaston Tarry came up with an exhaustive proof in 1901, which proofed that there is no solution to the 36 Cube puzzle.

The 36 Cube is, however, subtly different from the thirty-six officer problem. Careful inspection of the pieces reveals that two of the pieces are special. These two pieces will fit on certain parts of the base differently from other pieces of the same height. With this subtle modification, there are in fact 96 possible solutions to the 36 Cube puzzle.  
Source: [36 Cube Wikipedia page](https://en.wikipedia.org/wiki/36_Cube)

## How to run
Make sure you have JDK 8 and Maven 3 installed.
Then clone the repo and run

```
mvn java:exec
```

## Credits
I bought the cube and wrote some helpful lines, but the majority of the code comes frome Phis brilliant mind. 
