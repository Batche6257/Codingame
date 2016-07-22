function sign(foo,tems)
    for i,v in ipairs(tems) do
        if v == foo * -1 and result <0 then
            result = math.abs(result)
        end
end
return result

end


result = 5526
n = tonumber(io.read()) 
if n<1 then result =0 end
temps ={}
s=io.read()
y=0

for i in string.gmatch(s,"%S*") do 
    x= tonumber(i)
    table.insert(temps,x)
    y = y+1
end

for i=1,n do

    currVal = math.abs(temps[i])
    if currVal <math.abs(result) then
        result = temps[i]
        sign(result,temps)
    end
end



-- Write an action using print()
-- To debug: io.stderr:write("Debug message\n")

print(result)
