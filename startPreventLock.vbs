Set ws = wscript.CreateObject("WScript.Shell")
do
ws.sendkeys "{NUMLOCK}"
wscript.sleep 100
ws.sendkeys "{NUMLOCK}"
wscript.sleep 30000
loop