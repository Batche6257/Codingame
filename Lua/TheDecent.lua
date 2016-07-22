index =0
heighest = 0
heights = {}

while true do
    for i=0,7 do
        mountainH = tonumber(io.read())
        heights[i] = mountainH
    end
    
    for j=0,7 do
        if heights[j] > heighest then
            heighest = heights[j]
            index = j
        end
    end

    print(index)
    heighest = 0
end
