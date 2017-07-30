(ns clj-99.working-with-lists)

(defn my-last
  "Last element in the list."
  [[first & rest]]
  (if (empty? rest)
    first
    (recur rest)))

(defn my-last-2
  "Last Element in the list in another way"
  [lst]
  (if (empty? (rest lst))
    (first lst)
    (my-last-2 (rest lst))))

(defn but-my-last
  "Find the last but one box of a list"
  [lst]
  (let [[a b & c] (into [] (reverse lst))]
    (list b a)))

(defn element-at
  "Find the K'th element of a list."
  [lst numb]
  ((into [] lst) (dec numb)))

(defn element-at-k
  "Another way of doing K'th element of a list."
  [lst numb]
  (loop [count 1 list lst]
    (if (= count numb)
      (first list)
      (recur (inc count) (rest list)))))

(defn element-at-k-2
  "Another way of doing K'th element of a list."
  [lst numb]
  (if (= numb 1)
    (first lst)
    (recur (rest lst) (dec numb))))

(defn elem-count
  "Find the number of elements of a list."
  [lst]
  (if (empty? lst)
    0
    (+ 1 (elem-count (rest lst)))))

(defn elem-count-2
  "Find the number of elements of a list."
  [lst]
  (loop [count 0 alist lst]
    (if (empty? alist)
      count
      (recur (inc count)(rest alist)))))

(defn simple-reverse-list
  [lst]
  (reverse lst))

(defn reverse-list 
  "Reverse the element of alist."
  [lst]
  (into '() lst))

(defn reverse-list-2
  "Reverse the elements of a list."
  [lst]
  (loop [new '() alist lst]
    (if (empty? alist) 
      new
      (recur (conj new (first alist)) (rest alist)))))

(defn palindrome-or-not 
  "Find out whether a list is a palindrome."
  [lst]
  (= lst (reverse lst)))

(defn dirty-flatten-list
  "Flatten a nested list structure (Dirty Recursive Solution)."
  [lst]
  (if (empty? lst)
    lst
    (let [[first & rest] lst]
      (if (seq? first)
        (concat (dirty-flatten-list first) (dirty-flatten-list rest))
        (concat (cons first nil) (dirty-flatten-list rest))))))

(defn flatten-list
  "Better solution to Flatten a nested list structure."
  [lst]
  (loop [new-list '() [first & rest] lst]
    (if (nil? first)
        (reverse new-list)
        (if (seq? first)
            (recur new-list (concat first rest))
            (recur (cons first new-list) rest)))))

(defn compress 
  "Eliminate consecutive duplicates of list elements."
  [lst]
  (loop [new-list '() [frst & rst] lst]
    (if (nil? frst)
      (reverse new-list)
      (if (= (first new-list) frst)
        (recur new-list rst)
        (recur (cons frst new-list) rst)))))

(defn pack
  "Pack consecutive duplicates of list elements into sublists."
  [lst]
  (partition-by identity lst))


