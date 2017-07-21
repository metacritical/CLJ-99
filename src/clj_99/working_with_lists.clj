(ns clj-99.working-with-lists
  (:require [clojure.test :refer :all]))

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
