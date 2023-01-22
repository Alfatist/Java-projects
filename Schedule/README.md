<div>
<h1>SCREENS</h1>
<h2>FIRST SCREEN</h2>
<img src="1st screen.png">
<h2>SECOND SCREEN</h2>
<img src="2nd screen.png">
</div>
<h3>DESCRIPTION</h3>

This is a simple schedule system. It's not completely implemented, as you can see: the alarm doesn't 
work, the code is entire of bugs (try to type "a" in date), etc.

This code isn't focused on every functionality of a schedule. Here, I focused on the screens. 
EVERY CODE IN src


<h4>FIRST SCREEN</h4> 
The first screen is responsible by record an event. Here I didn't use a DB, but a txt.file local 
(events.txt). Here, the code checks the date but doesn't ensures the correct input. I know, it's 
something to fix... Anyway, if(date != XX/XX/XXXX): ERROR.

I didn't see the need to check e-mail, since it'll send nothing.

The alarm "doesn't work"; it's just living there... Actually, it does what I want: just send a 
boolean to 2nd screen.

FREQUENCY Radio buttons work well.

"Save" button will write the forms to "Events.txt" and call "Erase", which will... Erase the form (duh).

<h4>SECOND SCREEN</h4> 

This screen will read the events on "events.txt" and show them.

<h5>This code was produced with Java.swing and JavaFX. </h5>




