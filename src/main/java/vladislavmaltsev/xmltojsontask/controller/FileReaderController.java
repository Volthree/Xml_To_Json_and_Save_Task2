package vladislavmaltsev.xmltojsontask.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vladislavmaltsev.xmltojsontask.service.FileReaderService;

@Controller
@RequestMapping("/readerapi")
@RequiredArgsConstructor
public class FileReaderController {
    private final FileReaderService fileReaderService;
    @GetMapping("/read/{filename}")
    public ResponseEntity<String> read(@PathVariable String filename) {
        fileReaderService.readData(filename);
        return ResponseEntity.ok("Success");
    }
}
