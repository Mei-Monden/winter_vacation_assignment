p, q = gets.chomp.split(" ")

values = {
  "A" => 0,
  "B" => 3,
  "C" => 4,
  "D" => 8,
  "E" => 9,
  "F" => 14,
  "G" => 23
}

result = (values[p] - values[q]).abs

puts result
