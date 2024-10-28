package programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {

	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course(String string, String string2, int i, int j) {
		this.name = string;
		this.category = string2;
		this.reviewScore = i;
		this.noOfStudents = j;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return name + " : " + reviewScore + " : " + noOfStudents;
	}

}

public class FP04CustomClass {

	public static void main(String[] args) {

		/*
		 * List<Course> courses = List.of( new Course("Spring", "Framework", 98, 15000),
		 * new Course("Spring Boot", "Framework", 95, 16000), new Course("API",
		 * "Microservices", 97, 20000), new Course("Microservices", "Microservices", 96,
		 * 21000), new Course("Full Stack", "Framework", 91, 24000), new Course("AWS",
		 * "Cloud", 92, 14000), new Course("Azure", "Cloud", 99, 14000), new
		 * Course("Docker", "Cloud", 90, 14000), new Course("Kubernetes", "Cloud", 91,
		 * 22000) );
		 * 
		 * Predicate<? super Course> reviewScoreGreaterThan95Predicate = course ->
		 * course.getReviewScore() > 95;
		 * 
		 * Predicate<? super Course> reviewScoreGreaterThan90Predicate = course ->
		 * course.getReviewScore() > 90;
		 * 
		 * Predicate<? super Course> reviewScoreLessThan90Predicate = course ->
		 * course.getReviewScore() < 90;
		 * 
		 * 
		 * System.out.println(courses.stream().allMatch(
		 * reviewScoreGreaterThan95Predicate));
		 * System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate)
		 * ); System.out.println(courses.stream().anyMatch(
		 * reviewScoreGreaterThan90Predicate));
		 * System.out.println(courses.stream().anyMatch(
		 * reviewScoreGreaterThan95Predicate));
		 * 
		 * Comparator<Course> comparingByNoOfStudentsIncreasing =
		 * Comparator.comparingInt(Course::getNoOfStudents);
		 * 
		 * Comparator<Course> comparingByNoOfStudentsDecreasing =
		 * Comparator.comparingInt(Course::getNoOfStudents).reversed();
		 * 
		 * System.out.println("comparingByNoOfStudentsIncreasing: "+courses.stream()
		 * .sorted(comparingByNoOfStudentsIncreasing) .collect(Collectors.toList()));
		 * 
		 * System.out.println("comparingByNoOfStudentsDecreasing: "+courses.stream()
		 * .sorted(comparingByNoOfStudentsDecreasing) .collect(Collectors.toList()));
		 * 
		 * Comparator<Course> comparingByNoOfStudentsAndReviews =
		 * Comparator.comparingInt(Course::getNoOfStudents)
		 * .thenComparingInt(Course::getReviewScore) .reversed();
		 * 
		 * System.out.println("comparingByNoOfStudentsAndReviews: "+courses.stream()
		 * .sorted(comparingByNoOfStudentsAndReviews) .collect(Collectors.toList()));
		 * 
		 * //skip System.out.println(
		 * courses.stream().sorted(comparingByNoOfStudentsAndReviews) .skip(3)
		 * .collect(Collectors.toList()));
		 * 
		 * 
		 * //limit System.out.println(
		 * courses.stream().sorted(comparingByNoOfStudentsAndReviews) .limit(5)
		 * .collect(Collectors.toList()));
		 * 
		 *//**
			 * [Spring : 98 : 20000, Spring Boot : 95 : 20000, API : 97 : 20000,
			 * Microservices : 96 : 20000, Full Stack : 91 : 20000, AWS : 92 : 20000, Azure
			 * : 99 : 20000, Docker : 92 : 20000, Kubernetes : 91 : 20000]
			 */
		/*
		 * 
		 * 
		 * [Spring : 98 : 20000, Spring Boot : 95 : 20000, API : 97 : 20000,
		 * Microservices : 96 : 20000]
		 * 
		 * //takeWhile System.out.println( courses.stream() .takeWhile(course ->
		 * course.getReviewScore() >= 95) .collect(Collectors.toList()));
		 * 
		 * 
		 */
		/**
			 * [Full Stack : 91 : 20000, AWS : 92 : 20000, Azure : 99 : 20000, Docker : 92 :
			 * 20000, Kubernetes : 91 : 20000]
			 * 
			 */
		/*
				 * //dropWhile System.out.println( courses.stream() .dropWhile(course ->
				 * course.getReviewScore() >= 95) .collect(Collectors.toList()));
				 * 
				 * System.out.println( courses.stream()
				 * .max(comparingByNoOfStudentsAndReviews));
				 * 
				 * List<Integer> numbers = List.of(12, 15, 6, 4, 8, 9, 18, 19, 10, 2);
				 * 
				 * System.out.println(numbers.stream()
				 * .max(Comparator.comparing(Integer::valueOf)).get());
				 * 
				 * System.out.println( courses.stream()
				 * .filter(reviewScoreGreaterThan95Predicate) .mapToInt(x ->
				 * x.getNoOfStudents()) .sum());
				 * 
				 * System.out.println( courses.stream()
				 * .filter(reviewScoreGreaterThan95Predicate) .mapToInt(x ->
				 * x.getNoOfStudents()) .average());
				 * 
				 * System.out.println( courses.stream()
				 * .filter(reviewScoreGreaterThan95Predicate) .mapToInt(x ->
				 * x.getNoOfStudents()) .count());
				 * 
				 * System.out.println( courses.stream()
				 * .filter(reviewScoreGreaterThan95Predicate)
				 * .sorted(comparingByNoOfStudentsIncreasing) .mapToInt(x ->
				 * x.getNoOfStudents()) .findFirst());
				 * 
				 * System.out.println(
				 * courses.stream().collect(Collectors.groupingBy(Course::getCategory)) );
				 * 
				 * System.out.println( courses.stream().collect(
				 * Collectors.groupingBy(Course::getCategory, Collectors.counting())) );
				 * 
				 * System.out.println( courses.stream().collect(
				 * Collectors.groupingBy(Course::getCategory ,
				 * Collectors.maxBy(Comparator.comparing(Course::getReviewScore)) )));
				 */
		
		System.out.println(checkIfPangram("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	}

	public static boolean checkIfPangram(String sentence) {

		Set<Character> outputList = new HashSet<Character>();
		
		  for (int i = 0; i < sentence.length(); i++) 
		  { 
			  Character cSentence =
			  Character.toUpperCase(sentence.charAt(i));
		  
			  if (Character.isLetter(cSentence)) 
			  { 
				  outputList.add(cSentence); 
			  } 
		  }
		 
		  System.out.println(outputList);
		  
		return outputList.size() == 26;
	}

}
