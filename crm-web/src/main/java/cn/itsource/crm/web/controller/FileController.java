package cn.itsource.crm.web.controller;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/file")
@CrossOrigin
public class FileController {
    //按日期命名
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
    @RequestMapping(value = "/upload", method = RequestMethod.POST, name = "孙老师好帅啊")
    @ResponseBody
    public String upload(MultipartFile file, HttpServletRequest req) {

        String uploadPaths = req.getServletContext().getRealPath("/uploads/");

        String extensionName = FilenameUtils.getExtension(file.getOriginalFilename()); //1.jpg  jpg
            //按日期命名
        String fileName =sdf.format(new Date())+ "." + extensionName;

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File(uploadPaths, fileName));
            IOUtils.copy(file.getInputStream(),fos );
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



        return "/uploads/" + fileName;
    }

}
