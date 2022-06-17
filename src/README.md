# Main Duel

* For this activity your goal is to create an application that can create Wizards and have them duel.
* The Main class should have:
  - 3 Instance Fields: name, health, magicPower, luck.
  - your constructor should have a parameter for: name, magicPower.
  - health should be set to 100 as a default and luck should be set as a random number from 1-7 everytime a spell is cast. You might want to build a method that generates the random number for luck and sets its value.
  - Run a check and make sure that magicPower is less than or equal to 10. If someone tries to create an overpowered wizard assign them a power of 1.
  - create 2 methods that cast spells, one of them should heal the caster, the other should damage the other caster.
  - the spell that heals the caster should heal for the amount of magicPower the caster has multiplied by their luck.
  - the spell that damages the other caster should cause an amount of damage equal to the casters magicPower multiplied by their luck.
  - add various System.out.println() in your methods and in the main method to help show how the duel is going in the terminal.