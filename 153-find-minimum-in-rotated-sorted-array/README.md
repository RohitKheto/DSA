<h2><a href="https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/">Find Minimum in Rotated Sorted Array</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><p>Suppose an array of length <code>n</code> sorted in ascending order is rotated between 1 and <code>n</code> times. For example, the array <code>nums = [0,1,2,4,5,6,7]</code> might become:</p>

<ul>
	<li><code>[4,5,6,7,0,1,2]</code> if it was rotated 4 times.</li>
	<li><code>[0,1,2,4,5,6,7]</code> if it was rotated 7 times.</li>
</ul>

<p>Notice that rotating an array <code>[a[0], a[1], a[2], ..., a[n-1]]</code> 1 time results in the array <code>[a[n-1], a[0], a[1], a[2], ..., a[n-2]]</code>.</p>

<p>Given the sorted rotated array <code>nums</code> of unique elements, return the minimum element of this array.</p>

<p>You must write an algorithm that runs in <code>O(log n)</code> time.</p>

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [3,4,5,1,2]</span></p>

<p><strong>Output:</strong> <span class="example-io">1</span></p>

<p><strong>Explanation:</strong></p>

<p>The original array was <code>[1,2,3,4,5]</code> rotated 3 times.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [4,5,6,7,0,1,2]</span></p>

<p><strong>Output:</strong> <span class="example-io">0</span></p>

<p><strong>Explanation:</strong></p>

<p>The original array was <code>[0,1,2,4,5,6,7]</code> and it was rotated 4 times.</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [11,13,15,17]</span></p>

<p><strong>Output:</strong> <span class="example-io">11</span></p>

<p><strong>Explanation:</strong></p>

<p>The original array was <code>[11,13,15,17]</code> and it was rotated 4 times.</p>
</div>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == nums.length</code></li>
	<li><code>1 &le; n &le; 5000</code></li>
	<li><code>-5000 &le; nums[i] &le; 5000</code></li>
	<li>All the integers of <code>nums</code> are unique.</li>
	<li><code>nums</code> is sorted and rotated between 1 and <code>n</code> times.</li>
</ul>

<p><strong>Topics:</strong></p>

<p>Array, Binary Search</p>
