n = gets.to_i

input = []
n.times do
  input << gets.chomp.chars
end

outer_ring = []
(0...n).each { |i| outer_ring << input[0][i] }
(1...n).each { |i| outer_ring << input[i][n-1] }
(n-2).downto(0).each { |i| outer_ring << input[n-1][i] }
(n-2).downto(1).each { |i| outer_ring << input[i][0] }

rotated_ring = outer_ring.rotate(-1)

index = 0
(0...n).each { |i| input[0][i] = rotated_ring[index]; index += 1 }
(1...n).each { |i| input[i][n-1] = rotated_ring[index]; index += 1 }
(n-2).downto(0).each { |i| input[n-1][i] = rotated_ring[index]; index += 1 }
(n-2).downto(1).each { |i| input[i][0] = rotated_ring[index]; index += 1 }

input.each { |line| puts line.join }
