package com.b301.moeum.chord;

import java.util.List;
import java.util.Map;

public record ChordListResponse(
    List<Map<String, List<String>>> chordList
) {
}
