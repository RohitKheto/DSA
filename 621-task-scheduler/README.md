<h2><a href="https://leetcode.com/problems/task-scheduler/">621. Task Scheduler</a></h2> <img src='https://img.shields.io/badge/Medium-orange' alt='Difficulty: Medium' /><hr>

<p>You are given an array of CPU tasks, each labeled with a letter from A to Z, and a number <code>n</code>. Each CPU interval can be idle or allow the completion of one task. Tasks can be completed in any order, but there's a constraint: there has to be a gap of at least <code>n</code> intervals between two tasks with the same label.</p>

<p>Return the minimum number of CPU intervals required to complete all tasks.</p>

<p><strong class="example">Example 1:</strong></p>
<div class="example-block">
<p><strong>Input:</strong> <code>tasks = ["A","A","A","B","B","B"], n = 2</code></p>
<p><strong>Output:</strong> <code>8</code></p>
<p><strong>Explanation:</strong> A possible sequence is: <code>A -&gt; B -&gt; idle -&gt; A -&gt; B -&gt; idle -&gt; A -&gt; B</code>.</p>
<p>After completing task A, you must wait two intervals before doing A again. The same applies to task B. In the 3rd interval, neither A nor B can be done, so you idle. By the 4th interval, you can do A again as 2 intervals have passed.</p>
</div>

<p><strong class="example">Example 2:</strong></p>
<div class="example-block">
<p><strong>Input:</strong> <code>tasks = ["A","C","A","B","D","B"], n = 1</code></p>
<p><strong>Output:</strong> <code>6</code></p>
<p><strong>Explanation:</strong> A possible sequence is: <code>A -&gt; B -&gt; C -&gt; D -&gt; A -&gt; B</code>.</p>
<p>With a cooling interval of 1, you can repeat a task after just one other task.</p>
</div>

<p><strong class="example">Example 3:</strong></p>
<div class="example-block">
<p><strong>Input:</strong> <code>tasks = ["A","A","A","B","B","B"], n = 3</code></p>
<p><strong>Output:</strong> <code>10</code></p>
<p><strong>Explanation:</strong> A possible sequence is: <code>A -&gt; B -&gt; idle -&gt; idle -&gt; A -&gt; B -&gt; idle -&gt; idle -&gt; A -&gt; B</code>.</p>
<p>There are only two types of tasks, A and B, which need to be separated by 3 intervals. This leads to idling twice between repetitions of these tasks.</p>
</div>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 &lt;= tasks.length &lt;= 10<sup>4</sup></code></li>
<li><code>tasks[i]</code> is an uppercase English letter.</li>
<li><code>0 &lt;= n &lt;= 100</code></li>
</ul>
