<h2><a href="https://www.geeksforgeeks.org/problems/ceil-in-a-sorted-array/1">Ceil in Sorted Array</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr><p>Given a sorted array <code>arr[]</code> (which may contain duplicate elements) and an integer <code>x</code>, find the 0-based index of the first element greater than or equal to <code>x</code>. This element is called the <strong>ceil</strong> of <code>x</code>.</p>

<p>If no such element exists, return <code>-1</code>.</p>

<p><strong>Note:</strong> If multiple occurrences of the ceil exist, return the index of its first occurrence.</p>

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">arr[] = [1, 2, 8, 10, 11, 12, 19], x = 5</span></p>

<p><strong>Output:</strong> <span class="example-io">2</span></p>

<p><strong>Explanation:</strong></p>

<p>The smallest number greater than 5 is 8, whose index is 2.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">arr[] = [1, 2, 8, 10, 11, 12, 19], x = 20</span></p>

<p><strong>Output:</strong> <span class="example-io">-1</span></p>

<p><strong>Explanation:</strong></p>

<p>No element greater than or equal to 20 is found. So the output is -1.</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">arr[] = [1, 1, 2, 8, 10, 11, 12, 19], x = 0</span></p>

<p><strong>Output:</strong> <span class="example-io">0</span></p>

<p><strong>Explanation:</strong></p>

<p>The smallest number greater than 0 is 1, whose indices are 0 and 1. The index of the first occurrence is 0.</p>
</div>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &le; arr.size() &le; 10<sup>6</sup></code></li>
	<li><code>arr[i] &le; 10<sup>6</sup></code></li>
	<li><code>0 &le; x &le; 10<sup>6</sup></code></li>
</ul>

<p><strong>Expected Complexities:</strong></p>

<ul>
	<li><strong>Time Complexity:</strong> O(log n)</li>
	<li><strong>Auxiliary Space:</strong> O(1)</li>
</ul>

<p><strong>Company Tags:</strong></p>

<p><a href="https://www.geeksforgeeks.org/explore?company%5B%5D=Amazon">Amazon</a></p>

<p><strong>Topic Tags:</strong></p>

<p><a href="https://www.geeksforgeeks.org/explore?category%5B%5D=Binary%20Search">Binary Search</a> <a href="https://www.geeksforgeeks.org/explore?category%5B%5D=Sorting">Sorting</a> <a href="https://www.geeksforgeeks.org/explore?category%5B%5D=Searching">Searching</a></p>
