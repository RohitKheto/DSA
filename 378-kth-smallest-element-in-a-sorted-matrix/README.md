<h2><a href="https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/">Kth Smallest Element in a Sorted Matrix</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><p>Given an <code>n x n</code> matrix where each of the rows and columns is sorted in ascending order, return the <code>k</code>th smallest element in the matrix.</p>

<p>Note that it is the <code>k</code>th smallest element in the sorted order, not the <code>k</code>th distinct element.</p>

<p>You must find a solution with a memory complexity better than <code>O(n<sup>2</sup>)</code>.</p>

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8</span></p>

<p><strong>Output:</strong> <span class="example-io">13</span></p>

<p><strong>Explanation:</strong></p>

<p>The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">matrix = [[-5]], k = 1</span></p>

<p><strong>Output:</strong> <span class="example-io">-5</span></p>
</div>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == matrix.length == matrix[i].length</code></li>
	<li><code>1 &le; n &le; 300</code></li>
	<li><code>-10<sup>9</sup> &le; matrix[i][j] &le; 10<sup>9</sup></code></li>
	<li>All the rows and columns of <code>matrix</code> are guaranteed to be sorted in non-decreasing order.</li>
	<li><code>1 &le; k &le; n<sup>2</sup></code></li>
</ul>

<p><strong>Follow-up:</strong></p>

<ul>
	<li>Could you solve the problem with a constant memory (i.e., <code>O(1)</code> memory complexity)?</li>
	<li>Could you solve the problem in <code>O(n)</code> time complexity? The solution may be too advanced for an interview, but you may find reading the referenced paper interesting.</li>
</ul>
