n, d = gets.split(" ").map(&:to_i)

input = []

n.times do
  data = gets.split(" ").map(&:to_i)
  price = data[0]
  features = data[2..-1]
  input << { price: price, features: features }
end

result = "No"

(0...n).each do |i|
  (0...n).each do |j|
    next if i == j

    if input[i][:price] >= input[j][:price]
      features_i = input[i][:features]
      features_j = input[j][:features]

      if (features_i - features_j).empty?
        if input[i][:price] > input[j][:price] || (features_j - features_i).any?
          result = "Yes"
          break
        end
      end
    end
  end
  break if result == "Yes"
end

puts result
