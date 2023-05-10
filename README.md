# GraphicsTemplate
 
This project I made is used as a template for graphics in java. I use this template in the majority of my personal projects as it allows me to work on the primary project ideas without having to create an entire UI every time I create a new project.

## Main

The main folder has the important files used to run the graphics.

### Start

The Start file contains the main function and is used to start the project. The file creates a thread used to open the process window. The start file is in charge of trying to maintain 60 frames per second.

### Window

The Window file creates the Gui object as well as the Gameframe object. The window is in charge of updating the gui and gameframe upon every frame.

### Gui

The gui object is the actual user interface as it extends JFrame. This is also where user input is recieved and processed. When the gui recieves user input, the gui file processes the data and sends the desired information to the gameframe. The gui also creates a display object that is in charge of deciding what is rendered to the screen.

### Display

The display file decides what ins rendered to the screen. In this file you can add any types of screens you want in your program. Once added the display file will swap between the desired screens based on the current mode in the gameframe. For example there is currently a menu display that is rendered when the gameframe mode is equal to "Menu". You may add more screens in the displays folder and have them rendered based on the desired mode value.

### Gameframe

The gameframe file is where you will work on your program. You can initialize any objects you want inside the constructor function as it is called when the process starts. The update function is currently empty but you can put anything you want to be run per frame inside it. Currently the start file updates everything 60 times per second. So the update function will be called 60 times per second only when the mode is equal to "Mode1". The reason mode must equal "mode1" is because you don't want the program to run when everything is paused. For example if the mode is equal to "Menu". TYou can change the modes that allow the update function to be called via the if statement in the window file.

## Displays

The displays folder is used when creating displays or screens to be rendered inside the Display file. These files need to be be initialized and configured inside the Dispolay file in order to be rendered. There are currently 3 displays. The menu display is used to render a template menu. The mode1 display is used when the mode is equal to "Mode1". The mode1 display is a template tile based graphics that randomizes the color of each tile every frame. The mode1 display doesn't do much right now but is a great start to your graphics program as it has a reference to the gameframe object where you can get any data that is needed for you to then render to the screen.

## GameObjects

Any additional files you want to create for your program I recommend placing inside a separate folder and then importing inside your gameframe file.
