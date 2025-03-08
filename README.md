# Make Change Project

## Description

## technologies used
 - Java
 - Eclipse
 - Git/GitHub
 - Sublime Text Editor
 - zsh

 ## Concepts Applied

  - Conditional Statements
  - Mod
  - Methods and passing varibles to them
  - while loop
  - if statements
  - change variable type


 ## Lessons Learned

 -	i cant pass a method into another method or if i can, i cant figure out how. i have to store the result in variable and then pass the variable.  

 - i have to declare the variable outside the loop if i want to use it in all the if statements. 

 - change the type in the argument when you call the method. 

 ## Notes

 I switched amountTendered to amountReceived for my own clarity. 
 I turned the whole gathering of data into its own method. 
 - git commit. 

I made extra variables to store the results of each item in the after I Mod it. took me a while because i created all the variables but dint inital them to 0. 

giving up on the mod operator for now, just using >=.

 i tried using regular if statements for each but it didnt loop corerctly,  need to next if else if statments in a while loop. I removed the extra variables and just modified the variable i was passing in, I also had to change from a double to an int because it wasnt calculating acurately. did that in the argument after trying every other place. 
- git commit
```while (change > 0) {
			if (change >= 100) { 
					dollars++; 
					change = change - 100;
				}else if (change >= 25) { 
					quarters++; 
					change = change - 25;
				} else if (change >= 10) { 
					dimes++; 
					change = change - 10;
				} else if (change >= 5) { 
					nickles++; 
					change = change - 5;
				} else { 
				pennies++; 
				change = change - 1;
				}`








