<h2><a href="https://www.geeksforgeeks.org/problems/aggressive-cows/1">Aggressive Cows</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><p>Given an integer array <code>arr[]</code>, which denotes the positions of stalls. All the positions are distinct. There are <code>k</code> aggressive cows.</p>

<p>Assign the cows to the stalls such that the <strong>minimum</strong> distance between any two cows is <strong>maximized</strong>.</p>

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">arr[] = [1, 2, 4, 8, 9], k = 3</span></p>

<p><strong>Output:</strong> <span class="example-io">3</span></p>

<p><strong>Explanation:</strong></p>

<p>The first cow can be placed at arr[0], the second at arr[2], and the third at arr[3]. The minimum distance between any two cows is 3 (between arr[0] and arr[2]), which is the maximum possible among all valid arrangements.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">arr[] = [10, 1, 2, 7, 5], k = 3</span></p>

<p><strong>Output:</strong> <span class="example-io">4</span></p>

<p><strong>Explanation:</strong></p>

<p>The first cow can be placed at arr[0], the second at arr[1], and the third at arr[4]. In this arrangement, the minimum distance between any two cows is 4, which is the maximum possible among all valid arrangements.</p>
</div>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>arr.size() &le; 10<sup>6</sup></code></li>
	<li><code>0 &le; arr[i] &le; 10<sup>8</sup></code></li>
	<li><code>2 &le; k &le; arr.size()</code></li>
</ul>

<p><strong>Expected Complexities:</strong></p>

<ul>
	<li><strong>Time Complexity:</strong> O(n log m)</li>
	<li><strong>Auxiliary Space:</strong> O(1)</li>
</ul>
