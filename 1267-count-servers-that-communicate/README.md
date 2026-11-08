<h2><a href="https://leetcode.com/problems/count-servers-that-communicate/">1267. Count Servers that Communicate</a></h2> <img src='https://img.shields.io/badge/Medium-orange' alt='Difficulty: Medium' /><hr>

<p>You are given an <code>m x n</code> matrix <code>grid</code> where <code>grid[i][j] = 1</code> represents a server and <code>grid[i][j] = 0</code> represents an empty space.</p>

<p>Two servers are said to communicate if they are on the same row or column.</p>

<p>Return the number of servers that communicate with any other server.</p>

<p><strong class="example">Example 1:</strong></p>
<div class="example-block">
<p><strong>Input:</strong> <code>grid = [[1,0],[0,1]]</code></p>
<p><strong>Output:</strong> <code>0</code></p>
<p><strong>Explanation:</strong> No servers can communicate with each other.</p>
</div>

<p><strong class="example">Example 2:</strong></p>
<div class="example-block">
<p><strong>Input:</strong> <code>grid = [[1,0],[1,1]]</code></p>
<p><strong>Output:</strong> <code>3</code></p>
<p><strong>Explanation:</strong> All three servers can communicate with at least one other server.</p>
</div>

<p><strong class="example">Example 3:</strong></p>
<div class="example-block">
<p><strong>Input:</strong> <code>grid = [[1,1,0,0],[0,0,1,0],[0,0,1,0],[0,0,0,1],[0,0,0,1]]</code></p>
<p><strong>Output:</strong> <code>4</code></p>
<p><strong>Explanation:</strong> The two servers in the first row communicate with each other, and the two servers in the third column communicate with each other. The remaining servers cannot communicate with any other server.</p>
</div>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>m == grid.length</code></li>
<li><code>n == grid[i].length</code></li>
<li><code>1 &lt;= m, n &lt;= 250</code></li>
<li><code>grid[i][j]</code> is either <code>0</code> or <code>1</code>.</li>
<li>There is at least one server in the grid.</li>
</ul>
