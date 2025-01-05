n,m = gets.split(" ").map(&:to_i)
eaten = gets.split(" ").map(&:to_s)
plate = gets.split(" ").map(&:to_s)
price = gets.split(" ").map(&:to_i)

amount = 0
eaten.each do |color|
  if plate.include?(color)
    index = plate.index(color)
    amount += price[index+1]
  else
    amount += price[0]
  end
end

puts amount
