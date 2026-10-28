<h2><a href="https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1">Allocate Minimum Pages</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><p>Given an array <code>arr[]</code> of integers, where each element <code>arr[i]</code> represents the number of pages in the <code>i</code>th book. You also have an integer <code>k</code> representing the number of students. The task is to allocate books to each student such that:</p>

<ul>
	<li>Each student receives at least one book.</li>
	<li>Each student is assigned a contiguous sequence of books.</li>
	<li>No book is assigned to more than one student.</li>
	<li>All books must be allocated.</li>
</ul>

<p>The objective is to minimize the maximum number of pages assigned to any student. In other words, out of all possible allocations, find the arrangement where the student who receives the most pages still has the smallest possible maximum. If it is not possible to allocate books to all students, return <code>-1</code>.</p>

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">arr[] = [12, 34, 67, 90], k = 2</span></p>

<p><strong>Output:</strong> <span class="example-io">113</span></p>

<p><strong>Explanation:</strong></p>

<p>Allocation can be done in the following ways:</p>

<ul>
	<li><code>[12]</code> and <code>[34, 67, 90]</code>, Maximum Pages = 191</li>
	<li><code>[12, 34]</code> and <code>[67, 90]</code>, Maximum Pages = 157</li>
	<li><code>[12, 34, 67]</code> and <code>[90]</code>, Maximum Pages = 113</li>
</ul>

<p>The third combination has the minimum maximum pages assigned to a student, which is 113.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">arr[] = [15, 17, 20], k = 5</span></p>

<p><strong>Output:</strong> <span class="example-io">-1</span></p>

<p><strong>Explanation:</strong></p>

<p>Since there are more students than books, it is impossible to allocate at least one book to each student.</p>
</div>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &le; arr.size() &le; 10<sup>6</sup></code></li>
	<li><code>1 &le; arr[i], k &le; 10<sup>4</sup></code></li>
</ul>

<p><strong>Company Tags:</strong></p>

<p><a href="https://www.geeksforgeeks.org/explore?company%5B%5D=Infosys">Infosys</a> <a href="https://www.geeksforgeeks.org/explore?company%5B%5D=Amazon">Amazon</a> <a href="https://www.geeksforgeeks.org/explore?company%5B%5D=Microsoft">Microsoft</a> <a href="https://www.geeksforgeeks.org/explore?company%5B%5D=Google">Google</a> <a href="https://www.geeksforgeeks.org/explore?company%5B%5D=Codenation">Codenation</a> <a href="https://www.geeksforgeeks.org/explore?company%5B%5D=Uber">Uber</a> <a href="https://www.geeksforgeeks.org/explore?company%5B%5D=NPCI">NPCI</a></p>
