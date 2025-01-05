n = gets.to_i
a = gets.split(" ").map(&:to_i)

sorted_a = a.sort

(n - 1).times do |i|
  if sorted_a[i] + 1 != sorted_a[i + 1]
    puts sorted_a[i] + 1
    break
  end
end
