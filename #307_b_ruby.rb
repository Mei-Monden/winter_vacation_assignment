n = gets.to_i
input = []

n.times do
  input << gets.chomp
end

result = "No"

input.each do |word|
  input.each do |other_word|
    next if word == other_word
    combined = word + other_word
    if combined == combined.reverse
      result = "Yes"
      break
    end
  end
  break if result == "Yes"
end

puts result
