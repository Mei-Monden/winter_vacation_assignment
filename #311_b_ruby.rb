n, d = gets.split(" ").map(&:to_i)

schedule = []
n.times do |i|
  schedule << gets.to_s
end

max_streak = 0
current_streak = 0

d.times do |i|
  if n.times.all? { |t| schedule[t][i] == "o" }
    current_streak += 1
    max_streak = [max_streak, current_streak].max
  else
    current_streak = 0
  end
end

puts max_streak
