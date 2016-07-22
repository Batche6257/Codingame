
next_token = string.gmatch(io.read(), "[^%s]+")
lightX = tonumber(next_token())
lightY = tonumber(next_token())
initialTX = tonumber(next_token())
initialTY = tonumber(next_token())


while true do
    remainingTurns = tonumber(io.read())
    
    if (lightX > initialTX and lightY == initialTY) then
        initialTX = initialTX+1
        initialTY = initialTY+0
        print("E")
    elseif (lightX > initialTX and lightY > initialTY) then
        initialTX = initialTX+1
        initialTY = initialTY+1
        print("SE")
    elseif (lightX > initialTX and lightY < initialTY) then
        initialTX = initialTX+1
        initialTY = initialTY-1
        print("NE")        
    elseif (lightX == initialTX and lightY > initialTY) then
        initialTX = initialTX+0
        initialTY = initialTY+1
        print("S")
    elseif (lightX == initialTX and lightY < initialTY) then
        initialTX = initialTX+0
        initialTY = initialTY-1
        print("N")
    elseif (lightX < initialTX and lightY == initialTY) then
        initialTX = initialTX-1
        initialTY = initialTY+0
        print("W")
    elseif (lightX < initialTX and lightY < initialTY) then
        initialTX = initialTX-1
        initialTY = initialTY-1
        print("NW")
    elseif (lightX < initialTX and lightY > initialTY) then
        initialTX = initialTX-1
        initialTY = initialTY+1
        print("SW")
    end    
end
