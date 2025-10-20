# CSA-Lab-2A-Conditionals

## Tickets

Write a program that displays the price of a concert ticket. The concert ticket price is based on the seat location, as shown in the following table (use them as ints, not doubles). The user should be able to enter the seat location using either an uppercase (B, P, or L) or a lowercase (b, p, or l) letter.  (Hint:  use `toLowerCase( )` or `toUpperCase( )` on the variable or use OR statements).  Make sure the price in your output has a $ in front of it.

| Seat Location | Concert ticket price ($) |
|---------------|--------------------------|
| B (box)       | $75                      |
| P (pavilion)  | $30                      |
| L (lawn)      | $21                      |

If the user enters any other seat location, the program should display an `"Invalid Location"` message.


## Lottery

Write a Java program that picks a lottery number for the Virginia PowerBall Lottery game. In this lottery, the computer randomly chooses 5 numbers between 1 and 59 inclusive and a power ball number between 1 and 39 inclusive. 

Add code to allow the user to enter their numbers, one value at a time. Then compare the user choices with the winning combination.  For every matching number the person wins $50 dollars, with the exception of the PowerBall match in which they win $500. Output the user’s numbers, the winning numbers, and any prize money modeled after the below examples. (Note: the user’s choice must match in the same order to win).

| The winning number combination is:<br>	<br>5   22   1   45   55  Power Ball: 25 | The winning number combination is:<br>	<br>8   14   9   32   15   Power Ball: 33 |
|---------------------------------------------------------------------------------|---------------------------------------------------------------------------------|
| Your number combination is:<br>	<br>8   22   3   12   30   Power Ball: 25        | Your number combination is:<br>	<br>14   26   34   42   51   Power Ball: 19      |
| Congratulations! Your Prize is $550!                                            | Sorry, you did not win.                                                         |
