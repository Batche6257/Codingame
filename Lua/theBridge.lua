-- Auto-generated code below aims at helping you parse
-- the standard input according to the problem statement.

road = tonumber(io.read()) -- the length of the road before the gap.
gap = tonumber(io.read()) -- the length of the gap.
platform = tonumber(io.read()) -- the length of the landing platform.

-- game loop
while true do
    speed = tonumber(io.read()) -- the motorbike's speed.
    coordX = tonumber(io.read()) -- the position on the road of the motorbike.

            if(speed <= gap and coordX<road) then
            print("SPEED")
            
            else
                if(( speed > gap+1 and coordX < road) or coordX >=(road+gap)) then
                    print("SLOW")
                               
                elseif(road - coordX ==1) then
                    print("JUMP")
                else
                    print("WAIT")
                end
            end
        end
