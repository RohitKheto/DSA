<h2><a href="https://leetcode.com/problems/search-a-2d-matrix/">Search a 2D Matrix</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><p>You are given an <code>m x n</code> integer matrix <code>matrix</code> with the following two properties:</p>

<ul>
	<li>Each row is sorted in non-decreasing order.</li>
	<li>The first integer of each row is greater than the last integer of the previous row.</li>
</ul>

<p>Given an integer <code>target</code>, return <code>true</code> if <code>target</code> is in <code>matrix</code> or <code>false</code> otherwise.</p>

<p>You must write a solution in <code>O(log(m * n))</code> time complexity.</p>

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13</span></p>

<p><strong>Output:</strong> <span class="example-io">false</span></p>
</div>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>m == matrix.length</code></li>
	<li><code>n == matrix[i].length</code></li>
	<li><code>1 &le; m, n &le; 100</code></li>
	<li><code>-10<sup>4</sup> &le; matrix[i][j], target &le; 10<sup>4</sup></code></li>
</ul>
