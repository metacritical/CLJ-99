(ns clj-99.working-with-lists-test
  (:require [clojure.test :refer :all]
            [clj-99.core :refer :all]
            [clj-99.working-with-lists :refer :all]))

(deftest my-last-test
  "Should return the last elemet of the list."
  (is (= :e (my-last sym-list)))
  (is (=  6 (my-last-2 num-list))))


(deftest but-my-last-test
  "Find the last butone element of a list"
  (is (= '(5 6) (but-my-last num-list)))
  (is (= '(:d :e) (but-my-last sym-list))))

(deftest element-at-test
  "Find the K'th element of a list."
  (is (= 3 (element-at num-list 3)))
  (is (= :b (element-at sym-list 2)))
  (is (= 3 (element-at-k num-list 3)))
  (is (= :b (element-at-k sym-list 2)))
  (is (= 3 (element-at-k-2 num-list 3)))
  (is (= :b (element-at-k-2 sym-list 2))))

(deftest number-of-elements-in-a-list
  "Find the number of elements of a list"
  (is (= 0 (elem-count null-list)))
  (is (= 1 (elem-count uni-list)))
  (is (= 6 (elem-count num-list)))
  (is (= 5 (elem-count sym-list)))
  (is (= 0 (elem-count-2 null-list)))
  (is (= 1 (elem-count-2 uni-list)))
  (is (= 6 (elem-count-2 num-list)))
  (is (= 5 (elem-count-2 sym-list))))

(deftest reverse-elements-of-a-list
  "Reverse the elements of a list."
  (is (= (reverse num-list) (simple-reverse-list num-list)))
  (is (= (reverse sym-list) (simple-reverse-list sym-list)))
  (is (= (reverse num-list) (reverse-list num-list)))
  (is (= (reverse sym-list) (reverse-list sym-list)))
  (is (= (reverse num-list) (reverse-list-2 num-list)))
  (is (= (reverse sym-list) (reverse-list-2 sym-list))))

(deftest palindrome-or-not-test
  "Find if a list is a palindrome."
  (is (= true (palindrome-or-not '(1 2 3 2 1))))
  (is (= true (palindrome-or-not '(:a :b :c :b :a)))))


(deftest list-flattener
  "Flatten a nested list."
  (is (= '(1 2 3 4 5) (dirty-flatten-list '(1 (2 3) 4 (5)))))
  (is (= '(1 2 3 4 5 6 7) (dirty-flatten-list '(1 (2 (3) 4) (5 (6 (7)))))))
  (is (= '(1 2 3 4 5) (flatten-list '(1 (2 3) 4 (5)))))
  (is (= '(1 2 3 4 5 6 7) (flatten-list '(1 (2 (3) 4) (5 (6 (7))))))))
