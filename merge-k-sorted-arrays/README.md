<h2><a href="https://www.geeksforgeeks.org/problems/merge-k-sorted-arrays/1">Merge k Sorted Arrays</a></h2> <img src='https://img.shields.io/badge/Difficulty-orange' alt='Difficulty: Medium' /><hr>

<p>Given a 2D matrix <code>mat[][]</code> of size <code>n x m</code>. Each row in the matrix is sorted in non-decreasing order. Merge all the rows and return a single sorted array that contains all the elements of the matrix.</p>

<p><strong class="example">Example 1:</strong></p>
<div class="example-block">
<p><strong>Input:</strong> <code>mat[][] = [[1, 3, 5, 7], [2, 4, 6, 8], [0, 9, 10, 11]]</code></p>
<p><strong>Output:</strong> <code>[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]</code></p>
<p><strong>Explanation:</strong> Merging all elements from the 3 sorted arrays and sorting them results in: <code>[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]</code>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>
<div class="example-block">
<p><strong>Input:</strong> <code>mat[][] = [[1, 2, 3, 4], [2, 2, 3, 4], [5, 5, 6, 6], [7, 8, 9, 9]]</code></p>
<p><strong>Output:</strong> <code>[1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 9]</code></p>
<p><strong>Explanation:</strong> Merging all elements from the 4 sorted arrays and sorting them results in: <code>[1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 9]</code>.</p>
</div>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 ≤ n * m ≤ 10<sup>5</sup></code></li>
<li><code>0 ≤ mat[i][j] ≤ 10<sup>6</sup></code></li>
</ul>

<p><strong>Expected Complexities:</strong></p>
<ul>
<li><strong>Time Complexity:</strong> <code>O(k * log(n))</code>, where <code>k</code> is the total number of elements.</li>
<li><strong>Auxiliary Space:</strong> <code>O(n)</code></li>
</ul>
