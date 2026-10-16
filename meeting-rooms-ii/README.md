<h2><a href="https://www.geeksforgeeks.org/problems/meeting-rooms-ii/1">Meeting Rooms II</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><p>Given two arrays <code>start[]</code> and <code>end[]</code> such that <code>start[i]</code> is the starting time of the <code>i</code>th meeting and <code>end[i]</code> is the ending time of the <code>i</code>th meeting. Return the <strong>minimum number</strong> of rooms required to attend all meetings.</p>

<p><strong>Note:</strong> A person can also attend a meeting if its starting time is the same as the previous meeting's ending time.</p>

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">start[] = [1, 10, 7], end[] = [4, 15, 10]</span></p>

<p><strong>Output:</strong> <span class="example-io">1</span></p>

<p><strong>Explanation:</strong></p>

<p>Since all the meetings are held at different times, it is possible to attend all the meetings in a single room.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">start[] = [2, 9, 6], end[] = [4, 12, 10]</span></p>

<p><strong>Output:</strong> <span class="example-io">2</span></p>

<p><strong>Explanation:</strong></p>

<p>The 1st and 2nd meetings can be held in one room, but the 3rd meeting requires another room.</p>
</div>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &le; start.size() = end.size() &le; 10<sup>5</sup></code></li>
	<li><code>0 &le; start[i] &lt; end[i] &le; 10<sup>6</sup></code></li>
</ul>

<p><strong>Expected Complexities:</strong></p>

<ul>
	<li><strong>Time Complexity:</strong> O(n log n)</li>
	<li><strong>Auxiliary Space:</strong> O(1)</li>
</ul>

<p><strong>Topic Tags:</strong></p>

<p><a href="https://www.geeksforgeeks.org/explore?category%5B%5D=Heap">Heap</a> <a href="https://www.geeksforgeeks.org/explore?category%5B%5D=Greedy">Greedy</a> <a href="https://www.geeksforgeeks.org/explore?category%5B%5D=Sorting">Sorting</a> <a href="https://www.geeksforgeeks.org/explore?category%5B%5D=two-pointer-algorithm">Two Pointer Algorithm</a> <a href="https://www.geeksforgeeks.org/explore?category%5B%5D=Arrays">Arrays</a></p>
