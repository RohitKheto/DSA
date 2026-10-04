<h2><a href="https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1">Longest Substring with K Uniques</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><p>You are given a string <code>s</code> consisting only lowercase alphabets and an integer <code>k</code>. Your task is to find the <strong>length</strong> of the <strong>longest substring</strong> that contains exactly <code>k</code> distinct characters.</p>

<p><strong>Note:</strong> If no such substring exists, return <code>-1</code>.</p>

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "aabacbebebe", k = 3</span></p>

<p><strong>Output:</strong> <span class="example-io">7</span></p>

<p><strong>Explanation:</strong></p>

<p>The longest substring with exactly 3 distinct characters is <code>"cbebebe"</code>, which includes 'c', 'b', and 'e'.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "aaaa", k = 2</span></p>

<p><strong>Output:</strong> <span class="example-io">-1</span></p>

<p><strong>Explanation:</strong></p>

<p>There's no substring with 2 distinct characters.</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "aabaaab", k = 2</span></p>

<p><strong>Output:</strong> <span class="example-io">7</span></p>

<p><strong>Explanation:</strong></p>

<p>The entire string <code>"aabaaab"</code> has exactly 2 unique characters 'a' and 'b', making it the longest valid substring.</p>
</div>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &le; s.size() &le; 10<sup>5</sup></code></li>
	<li><code>1 &le; k &le; 26</code></li>
</ul>

<p><strong>Expected Complexities:</strong></p>

<ul>
	<li><strong>Time Complexity:</strong> O(n)</li>
	<li><strong>Auxiliary Space:</strong> O(1)</li>
</ul>

<p><strong>Company Tags:</strong></p>

<p><a href="https://www.geeksforgeeks.org/explore?company%5B%5D=Amazon">Amazon</a> <a href="https://www.geeksforgeeks.org/explore?company%5B%5D=Google">Google</a> <a href="https://www.geeksforgeeks.org/explore?company%5B%5D=SAP%20Labs">SAP Labs</a></p>

<p><strong>Topic Tags:</strong></p>

<p><a href="https://www.geeksforgeeks.org/explore?category%5B%5D=two-pointer-algorithm">Two Pointer Algorithm</a> <a href="https://www.geeksforgeeks.org/explore?category%5B%5D=Hash">Hash</a> <a href="https://www.geeksforgeeks.org/explore?category%5B%5D=Strings">Strings</a> <a href="https://www.geeksforgeeks.org/explore?category%5B%5D=Map">Map</a></p>
