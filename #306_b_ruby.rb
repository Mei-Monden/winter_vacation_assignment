input = gets.split(" ").map(&:to_i)
n = input.length

sum = 0
n.times do |i|
  sum += input[i] * 2 ** i
end

puts sum
