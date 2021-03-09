# Strategy-Pattern:  
a Brief implementation of a kindergarden-child problem solved with the strategy pattern

## Problem and context:
We are given a kindergarden where twice a month, 2 different doctors come to the place to examine the childs, send the corresponding bill and sending the results to their parents.

For this build, we have the following java classes:  
* A Support class called child that it's used as a data container.
* The ExamStrategy interface containing the common methods used by each strategy.
* The Oculist and SpeechTherapist classes for each strategy.
* Finally a Test class with the main function to try the strategy with a simple example

## Conclusions:  
Even thoguht this strategy is perfecty suitable for the task, I find a better solution to encapsulate everything in an abstract class instead of having to use a context class, at least for this particual problem (this might have to do with my habit with programming POO in c++).  

## Author:  
Javier Orti García.
