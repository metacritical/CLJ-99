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
