WeCanCodeIt Graded Assignment #3

Virtual Pets AMOK!

-This application has 9 classes: VirtualPetShelterApp, VirtualPetShelter, VirtualPet, Dog, Cat,
Organic Dog, Organic Cat, Robotic Dog, and Robotic Cat

-This application also has 2 interfaces: Organic and Robotic

-All of my TDD unit tests can be found in the VirtualPetTest class, which is within the test directory.

-Before writing any code in this application I drew out an inheritance hierarchy tree to help layout
all of my classes that were required. In doing so, I was able to find many areas in this hierarchical diagram 
where I could separate those classes into more of an abstraction, including areas where I could even create 
interfaces.

-VirtualPetShelter class:
1) This class contains a Map called "virtualShelter" where all virtual pets live.
2) I have a method called "availableVirtualPets", which is of type Map. This method is implemented in numerous other
methods that are found in this class.
3) Most, if not all, of my methods implement an enhanced "for" loop that contain nested "if" statements which contain
the "instanceof" operator to check if the object is an instance of a particular class, subclass, or interface.
4) I also organized all my Status Chart Header methods for each type of virtual pet, so the user can have a clean
console output when the application starts.

-VirtualPetShelterApp class:
1) Compared to last week's project, the setup for this application class is the same except for a few more
additional user choice options that can be found in the displayInstructions method. 

-VirtualPet class:
1) I decided to make this class abstract. All future subclasses will end up extending this class because they all
share common attributes that will always make them a virtual pet.

-Cat/Dog class:
1) Both of these classes can be described as super classes of all organic and robotic cats/dogs.
2) These two classes extend VirtualPet, so they automatically inherit those common attributes and methods
3) The only major change that can be observed in either of these classes is that the Dog class implements its own
walk method, which is specific to this class and any of its subclasses.

-Organic Cat/Dog class:
1) Both of these classes are subclasses of either their Cat or Dog superclass. 
2) Both of these classes implement their Organic interface, which contain specific methods pertaining to only organic
cats/dogs. Through this implementation, each class overrides those methods found in the Organic interface.
3) Because organic pets create waste, each class has its own levelOfWaste field as well as their own method that will
set this field to zero through the act of cleaning their cage or litter box.

-Robotic Cat/Dog class:
1) Both of these classes are subclasses of either their Cat or Dog superclass. 
2) Both of these classes implement their Robotic interface, which contain specific methods pertaining to only robotic
cats/dogs. Through this implementation, each class overrides those methods found in the Robotic interface.
3) Because robotic pets need oil maintenance to function optimally, each class has its own oilMaintenance field as well 
as their own method that will increase the value of this field through the act of performing oil maintenance.

-Organic & Robotic interface:
1) Since robotic pets cannot be fed or watered, I created a Robotic interface that has a method to oil the robotic pets
only.
2) Since organic pets cannot be oiled, I created an Organic interface that has two methods to feed and water the organic
pets only.




