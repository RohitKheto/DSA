<h2><a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/">Find First and Last Position of Element in Sorted Array</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><p>Given an array of integers <code>nums</code> sorted in non-decreasing order, find the starting and ending position of a given target value.</p>

<p>If <code>target</code> is not found in the array, return <code>[-1, -1]</code>.</p>

<p>You must write an algorithm with <code>O(log n)</code> runtime complexity.</p>

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [5,7,7,8,8,10], target = 8</span></p>

<p><strong>Output:</strong> <span class="example-io">[3,4]</span></p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [5,7,7,8,8,10], target = 6</span></p>

<p><strong>Output:</strong> <span class="example-io">[-1,-1]</span></p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [], target = 0</span></p>

<p><strong>Output:</strong> <span class="example-io">[-1,-1]</span></p>
</div>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &le; nums.length &le; 10<sup>5</sup></code></li>
	<li><code>-10<sup>9</sup> &le; nums[i] &le; 10<sup>9</sup></code></li>
	<li><code>nums</code> is a non-decreasing array.</li>
	<li><code>-10<sup>9</sup> &le; target &le; 10<sup>9</sup></code></li>
</ul>

<p><strong>Topics:</strong></p>

<p>Array, Binary Search</p>
