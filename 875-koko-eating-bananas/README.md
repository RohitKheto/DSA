<h2><a href="https://leetcode.com/problems/koko-eating-bananas/">Koko Eating Bananas</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><p>Koko loves to eat bananas. There are <code>n</code> piles of bananas, the <code>i</code>th pile has <code>piles[i]</code> bananas. The guards have gone and will come back in <code>h</code> hours.</p>

<p>Koko can decide her bananas-per-hour eating speed of <code>k</code>. Each hour, she chooses some pile of bananas and eats <code>k</code> bananas from that pile. If the pile has less than <code>k</code> bananas, she eats all of them instead and will not eat any more bananas during this hour.</p>

<p>Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.</p>

<p>Return the minimum integer <code>k</code> such that she can eat all the bananas within <code>h</code> hours.</p>

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">piles = [3,6,7,11], h = 8</span></p>

<p><strong>Output:</strong> <span class="example-io">4</span></p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">piles = [30,11,23,4,20], h = 5</span></p>

<p><strong>Output:</strong> <span class="example-io">30</span></p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">piles = [30,11,23,4,20], h = 6</span></p>

<p><strong>Output:</strong> <span class="example-io">23</span></p>
</div>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &le; piles.length &le; 10<sup>4</sup></code></li>
	<li><code>piles.length &le; h &le; 10<sup>9</sup></code></li>
	<li><code>1 &le; piles[i] &le; 10<sup>9</sup></code></li>
</ul>

<p><strong>Topics:</strong></p>

<p>Array, Binary Search</p>
