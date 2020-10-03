package dev.student.dhbw.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class SimpleFileWriter
{

    /**
     * This method allows you to write text content to a file. If this file already
     * exists with text content, the content will be appended without a line
     * separator.
     * 
     * @param filePath
     *            The path to the file.
     * @param content
     *            The content you want to write.
     */
    public static void writeToFile(String filePath, String content)
    {
        writeToFile(filePath, content, true);
    }
    

    /**
     * This method enables you to write text content to a file. If this file already
     * exists with text content, the content will be appended without a line
     * separator.
     * 
     * @param filePath
     *            The path to the file.
     * @param lineSeparatedContent
     *            The content you want to write in form of a list with the strings
     *            for each line.
     */
    public static void writeToFile(String filePath, List<String> lineSeparatedContent)
    {
        writeToFile(filePath, lineSeparatedContent, true);
    }

    /**
     * This method enables you to write text content to a file.
     * 
     * @param filePath
     *            The path to the file.
     * @param lineSeparatedContent
     *            The content you want to write in form of a list with the strings
     *            for each line.
     * @param appendToExistingFile
     *            The flag if you want to create a new file with the given content
     *            or you want to append to a pre-existing file.
     */
    public static void writeToFile(String filePath, List<String> lineSeparatedContent,
            boolean appendToExistingFile)
    {
        try (BufferedWriter fileWriter = new BufferedWriter(
                new FileWriter(filePath, appendToExistingFile)))
        {
            for (String fileLine : lineSeparatedContent)
            {
                fileWriter.write(fileLine);
                fileWriter.write("\n");
            }
            fileWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    /**
     * This method enables you to write text content to a file.
     * 
     * @param filePath
     *            The path to the file.
     * @param lineSeparatedContent
     *            The content you want to write in form of a list with the strings
     *            for each line.
     * @param appendToExistingFile
     *            The flag if you want to create a new file with the given content
     *            or you want to append to a pre-existing file.
     * @param newLineWhenAppending
     *            The flag whether you want to generate a new line separator when
     *            you want to append or create a file.
     */
    public static void writeToFile(String filePath, List<String> lineSeparatedContent,
            boolean appendToExistingFile, boolean newLineWhenAppending)
    {
        try (BufferedWriter fileWriter = new BufferedWriter(
                new FileWriter(filePath, appendToExistingFile)))
        {
            for (String fileLine : lineSeparatedContent)
            {
                fileWriter.write(fileLine);
                fileWriter.write("\n");
            }
            fileWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    /**
     * This method enables you to write text content to a file.
     * 
     * @param filePath
     *            The path to the file.
     * @param content
     *            The content you want to write.
     * @param appendToExistingFile
     *            The flag if you want to create a new file with the given content
     *            or you want to append to a pre-existing file.
     */
    public static void writeToFile(String filePath, String content, boolean appendToExistingFile)
    {
        try (BufferedWriter fileWriter = new BufferedWriter(
                new FileWriter(filePath, appendToExistingFile)))
        {
            fileWriter.write(content);
            fileWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * This method enables you to write text content to a file.
     * 
     * @param filePath
     *            The path to the file.
     * @param content
     *            The content you want to write.
     * @param appendToExistingFile
     *            The flag if you want to create a new file with the given content
     *            or you want to append to a pre-existing file.
     * @param newLineWhenAppending
     *            The flag whether you want to generate a new line separator when
     *            you want to append or create a file.
     */
    public static void writeToFile(String filePath, String content, boolean appendToExistingFile,
            boolean newLineWhenAppending)
    {
        try (BufferedWriter fileWriter = new BufferedWriter(
                new FileWriter(filePath, appendToExistingFile)))
        {
            if (newLineWhenAppending)
            {
                fileWriter.write("\n");
            }
            fileWriter.write(content);
            fileWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
