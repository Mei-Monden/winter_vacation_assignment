n = gets.to_i

c = []
a = []
n.times do |i|
  c << gets.to_i
  a << gets.split(" ").map(&:to_i)
end

x = gets.to_i

b = []
number_of_elements = 0
a.each_with_index do |array, index|
  if array.include?(x)
    if number_of_elements == 0
      number_of_elements = array.size
      b << index+1
    elsif number_of_elements > array.size
      b = []
      b << index+1
      number_of_elements = array.size
    elsif number_of_elements == array.size
      b << index+1
    end
  end
end

puts b.count
puts b.join(" ")
