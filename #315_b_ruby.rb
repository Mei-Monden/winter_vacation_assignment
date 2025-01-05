m = gets.to_i
d = gets.split(" ").map(&:to_i)

median = d.sum / 2 + 1

sum = 0

a = 1
m.times do |i|
  if sum + d[i] < median
    sum += d[i]
  else
    a = i + 1
    break
  end
end

b = 0
while sum < median
  b += 1
  sum += 1
end

print "#{a} #{b}\n"
