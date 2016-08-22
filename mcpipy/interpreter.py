#
# Code under the MIT license by Alexander R. Pruss
#
# Useful for checking which interpreter RaspberryJamMod's /py command is picking up.
#

from mine *
import sys
import os

mc = Minecraft()
mc.postToChat("Python interpreter "+sys.executable+" "+sys.version)
try:
    userName = os.environ['MINECRAFT_PLAYER_NAME']
except:
    userName = "unspecified"
mc.postToChat("Invoked by user "+userName+" "+str(mc.player.id))
mc.postToChat("Server "+str(mc.conn.socket.getpeername()))
